class DataExtended {
	int x;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public DataExtended() {
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int getX() {
		return this.x;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setX(final int x) {
		this.x = x;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof DataExtended)) return false;
		final DataExtended other = (DataExtended) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (this.getX() != other.getX()) return false;
		return true;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof DataExtended;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.getX();
		return result;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public java.lang.String toString() {
		return "DataExtended(x=" + this.x + ")";
	}
}
