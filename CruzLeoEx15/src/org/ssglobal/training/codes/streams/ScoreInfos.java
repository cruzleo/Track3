package org.ssglobal.training.codes.streams;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreInfos {
	private Score[] scoreData = new Score[0];
	
	public ScoreInfos(Score[] scoreData) {
		this.scoreData = scoreData;
	}
	
	public long getNumScores() {
		long noOfStudents = Arrays.stream(scoreData).count();
		return noOfStudents;
	}
	
	public double getAverage() {
		double avg = Arrays.stream(scoreData).map(score -> score.getScore())
													 .mapToInt((score) -> score.intValue())
													 .average().getAsDouble();
		return avg;
	}
	
	public int getNumberALister() {
		int noOfALister = (int) Arrays.stream(scoreData).filter(score -> score.getScore() >= 90).count();
		return noOfALister;
	}
	
	public List<String> getFailingStudentList() {
		List<String> namesOfFailing = Arrays.stream(scoreData).filter(score -> score.getScore() < 70)
											.map(name -> String.join(" ", name.getFirstName(), name.getLastName()))
											.collect(Collectors.toList());
		return namesOfFailing;
	}
	
	public void printPassingStudents() {
		List<String> namesOfPassing = Arrays.stream(scoreData).filter(score -> score.getScore() >= 70)
											.map(name -> String.join(" ", name.getFirstName(), name.getLastName()))
											.collect(Collectors.toList());
		System.out.println(namesOfPassing);
	}
	
	public void displayAllStudents() {
		Arrays.stream(scoreData).sorted((n1, n2) -> n1.getLastName().compareTo(n2.getLastName()))
								.map(name -> "%s %s %d".formatted(name.getFirstName(), name.getLastName(), name.getScore()) )
								.forEach(System.out::println);
	}
	
	public List<String> getStudentsRecord() {
		List<String> studentRecords = Arrays.stream(scoreData)
											.sorted((s1, s2) -> s1.getScore() - s2.getScore())
											.map(name -> "%s %s %d".formatted(name.getFirstName(), name.getLastName(), name.getScore()))
											.collect(Collectors.toList());
		return studentRecords;
	}
	public boolean saveAllRecords() {
		Path txtFile = Paths.get("src", "files", "scores.txt");
		ByteBuffer studRecord = ByteBuffer.allocate(5124);
		
		try (SeekableByteChannel channel = Files.newByteChannel(txtFile, StandardOpenOption.CREATE, StandardOpenOption.APPEND);) {
			for (Score s: scoreData) {
				String record = "%s %s %d\n".formatted(s.getFirstName(), s.getLastName(), s.getScore());
				studRecord.put(record.getBytes());
			}
			studRecord.flip();
			channel.write(studRecord);
			
			return true;
		} catch (IOException e) {
		System.out.println(e.getMessage());
		}
		return false;	
	}
}
