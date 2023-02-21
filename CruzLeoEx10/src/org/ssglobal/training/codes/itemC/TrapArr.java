package org.ssglobal.training.codes.itemC;

import java.util.Scanner;

import org.ssglobal.training.codes.itemC.Exception.BadIndexException;
import org.ssglobal.training.codes.itemC.Exception.ElementCharException;
import org.ssglobal.training.codes.itemC.Exception.ElementDecimalException;
import org.ssglobal.training.codes.itemC.Exception.InvalidSizedException;
import org.ssglobal.training.codes.itemC.Exception.LetterSizeException;

public class TrapArr {
	public void arrTransact() {
		try (Scanner scan = new Scanner(System.in);) {

			while (true) {
				System.out.print("Enter the Array size: ");
				String arrSizeStr = scan.next();
				boolean isActive = false;
				int arrSizeVal = 0;

				try {
					arrSizeVal = covertArrSize(arrSizeStr);
				} catch (InvalidSizedException e) {
					System.out.println(e.getMessage());
				} catch (LetterSizeException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				int[] array = new int[arrSizeVal];
				int counter = 0;
				int arrElemVal = 0;
				while (counter < array.length) {
					for (int i = 0; i < array.length; i++) {
						System.out.print("Enter the value: ");
						String arrElemStr = scan.next();

						try {
							arrElemVal = covertarrElem(arrElemStr);
							isActive = true;
						} catch (ElementCharException e) {
							System.out.println(e.getMessage());
							continue;
						} catch (ElementDecimalException e) {
							System.out.println(e.getMessage());
							continue;
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}

						array[i] = arrElemVal;
						counter++;
					}

				}

				while (isActive) {
					System.out.print("Enter the index that you want to view: ");
					String inViewStr = scan.next();

					if (inViewStr.equalsIgnoreCase("e")) {
						System.out.println("Good Bye");
						System.exit(0);
					}

					int inViewVal = 0;
					try {
						inViewVal = convertIndex(inViewStr, arrSizeStr);
						System.out.print("The Value in index %s is %d\n".formatted(inViewStr, array[inViewVal]));
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println(e.getMessage());
						continue;
					} catch (BadIndexException e) {
						System.out.println(e.getMessage());
						continue;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}

	private int covertArrSize(String arrSizeStr) throws InvalidSizedException, LetterSizeException, Exception {
		int arrSize = 0;

		try {
			arrSize = Integer.parseInt(arrSizeStr);
			if (arrSize < 0) {
				throw new NegativeArraySizeException("Array size cannot be negative");
			}
		} catch (NumberFormatException e) {
			throw new InvalidSizedException();
		}

		return arrSize;
	}

	private int covertarrElem(String arrElemStr) throws ElementCharException, ElementDecimalException, Exception {
		int arrElemVal = 0;

		try {
			arrElemVal = Integer.parseInt(arrElemStr);

		} catch (NumberFormatException e) {
			if (arrElemStr.length() == 1) {
				throw new ElementCharException();
			} else if (arrElemStr instanceof String) {
				throw new ElementCharException("Invalid element value: [String]");
			}

			Double arrDouble = Double.valueOf(arrElemStr);
			if (Double.parseDouble(arrElemStr) == arrDouble) {
				throw new ElementDecimalException();
			}
		}

		return arrElemVal;
	}

	private int convertIndex(String indexStr, String arrSize)
			throws BadIndexException, IndexOutOfBoundsException, Exception {
		int indexVal = 0;

		try {
			indexVal = Integer.parseInt(indexStr);
			if (indexVal > Integer.parseInt(arrSize)) {
				throw new BadIndexException();
			}
		} catch (IndexOutOfBoundsException e) {
			if (indexVal > Integer.parseInt(arrSize)) {
				throw new BadIndexException();
			}
		} catch (NumberFormatException e) {
			throw new BadIndexException();
		}

		return indexVal;
	}
}
