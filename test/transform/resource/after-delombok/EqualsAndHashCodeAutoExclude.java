class EqualsAndHashCodeAutoExclude {
	int x;
	String $a;
	transient String b;
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof EqualsAndHashCodeAutoExclude)) return false;
		final EqualsAndHashCodeAutoExclude other = (EqualsAndHashCodeAutoExclude) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (this.x != other.x) return false;
		return true;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof EqualsAndHashCodeAutoExclude;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.x;
		return result;
	}
}
class EqualsAndHashCodeAutoExclude2 {
	int x;
	String $a;
	transient String b;
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof EqualsAndHashCodeAutoExclude2)) return false;
		final EqualsAndHashCodeAutoExclude2 other = (EqualsAndHashCodeAutoExclude2) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		if (this.x != other.x) return false;
		final java.lang.Object this$$a = this.$a;
		final java.lang.Object other$$a = other.$a;
		if (this$$a == null ? other$$a != null : !this$$a.equals(other$$a)) return false;
		final java.lang.Object this$b = this.b;
		final java.lang.Object other$b = other.b;
		if (this$b == null ? other$b != null : !this$b.equals(other$b)) return false;
		return true;
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof EqualsAndHashCodeAutoExclude2;
	}
	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		result = result * PRIME + this.x;
		final java.lang.Object $$a = this.$a;
		result = result * PRIME + ($$a == null ? 43 : $$a.hashCode());
		final java.lang.Object $b = this.b;
		result = result * PRIME + ($b == null ? 43 : $b.hashCode());
		return result;
	}
}
