package com.eric.jsongson.innerclass;

public class AlbumsWithInnerClass {
	public String name;
	private String year;
	public Dataset[] datasetsInner;
	public Dataset2[] datasetsStatic;

	public void setDatasetsInner(Dataset[] datasetsInner) {
		this.datasetsInner = datasetsInner;
	}

	public void setDatasetsStatic(Dataset2[] datasetsStatic) {
		this.datasetsStatic = datasetsStatic;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(String year) {
		this.year = year;
	}

	class Dataset {
		public String album_name;
		public String album_id;

		public void setAlbum_id(String album_id) {
			this.album_id = album_id;
		}

		public void setAlbum_name(String album_name) {
			this.album_name = name + "_" + album_name;
		}
	}

	static class Dataset2 {
		public String album_name;
		public String album_id;

		public void setAlbum_id(String album_id) {
			this.album_id = album_id;
		}

		public void setAlbum_name(String album_name) {
			this.album_name = album_name;
		}
	}
}
