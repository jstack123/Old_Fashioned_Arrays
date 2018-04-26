package _02_diy_array_list;

public class ArrayList<T> {
	T[] list;

	public ArrayList() {
		list = (T[]) new Object[0];
	}

	public void add(T value) {
		T[] temp = (T[]) new Object[list.length + 1];

		for (int i = 0; i < list.length; i++) {
			// list[i] = value;
			temp[i] = list[i];
		}
		temp[temp.length - 1] = value;
		list = temp;
	}

	public T get(int location) {
		return list[location];
	}

	public void set(int location, T value) {
		list[location] = value;
	}

	public void addAt(int location, T value) {
		T[] temp = (T[]) new Object[list.length + 1];

		for (int i = 0; i < temp.length; i++) {
			if (i < temp.length) {

				if (i < location) {
					temp[i] = list[i];
				}
				if (i == location) {
					temp[location] = value;
				}
				if (i > location) {
					temp[i] = list[i - 1];
				}
			}

		}
		list = temp;

	}

	public void remove(int location) {
		T[] temp = (T[]) new Object[list.length - 1];

		for (int i = 0; i < temp.length; i++) {
			if (i < temp.length) {

				if (i < location) {
					temp[i] = list[i];
				}
				if (i == location || i > location) {
					temp[i] = list[i + 1];
				}

			}

		}
		list = temp;
	}

	public boolean contains(T value) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == value) {
				return true;
			}

		}
		return false;
	}
}
