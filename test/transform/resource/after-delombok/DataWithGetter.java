class DataWithGetter {
	private int x;
	private int y;
	private final String z;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public DataWithGetter(final String z) {
		this.z = z;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setX(final int x) {
		this.x = x;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setY(final int y) {
		this.y = y;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof DataWithGetter)) return false;
		final DataWithGetter other = (DataWithGetter) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (this.getX() != other.getX()) return false;
		if (this.getY() != other.getY()) return false;
		final java.lang.Object this$z = this.getZ();
		final java.lang.Object other$z = other.getZ();
		if (this$z == null ? other$z != null : !this$z.equals(other$z)) return false;
		return true;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof DataWithGetter;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.getX();
		result = result * PRIME + this.getY();
		final java.lang.Object $z = this.getZ();
		result = result * PRIME + ($z == null ? 43 : $z.hashCode());
		return result;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public java.lang.String toString() {
		return "DataWithGetter(x=" + this.getX() + ", y=" + this.getY() + ", z=" + this.getZ() + ")";
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int getX() {
		return this.x;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int getY() {
		return this.y;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public String getZ() {
		return this.z;
	}
}
