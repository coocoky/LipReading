package edu.lipreading;

import java.util.List;
import java.util.Vector;

public class Sample {
	private final static short NUM_OF_STICKERS = 4;
	private int id;
	private List<List<Point>> matrix;
	
	public Sample(int id, List<List<Point>> matrix) {
		super();
		this.id = id;
		this.matrix = matrix;
	}

	public Sample(int id) {
		super();
		this.id = id;
		this.matrix = new Vector<List<Point>>();
		for (int i = 0; i < NUM_OF_STICKERS; i++) {
			this.matrix.add(new Vector<Point>());	
		}
	}

	public int getId() {
		return id;
	}

	public Sample setId(int id) {
		this.id = id;
		return this;
	}

	public List<List<Point>> getMatrix() {
		return matrix;
	}

	public Sample setMatrix(List<List<Point>> matrix) {
		this.matrix = matrix;
		return this;
	}

	@Override
	public String toString() {
		return "Sample [id=" + id + ", matrix=" + matrix + "]";
	}
	
	
}
