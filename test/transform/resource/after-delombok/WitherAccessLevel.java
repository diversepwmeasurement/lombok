class WitherAccessLevel {
	boolean isNone;
	boolean isPrivate;
	boolean isPackage;
	boolean isProtected;
	boolean isPublic;
	boolean value;
	WitherAccessLevel(boolean isNone, boolean isPrivate, boolean isPackage, boolean isProtected, boolean isPublic, boolean value) {
	}
	/**
	 * @return a clone of this object, except with this updated property (returns {@code this} if an identical value is passed).
	 */
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	private WitherAccessLevel withPrivate(final boolean isPrivate) {
		return this.isPrivate == isPrivate ? this : new WitherAccessLevel(this.isNone, isPrivate, this.isPackage, this.isProtected, this.isPublic, this.value);
	}
	/**
	 * @return a clone of this object, except with this updated property (returns {@code this} if an identical value is passed).
	 */
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	WitherAccessLevel withPackage(final boolean isPackage) {
		return this.isPackage == isPackage ? this : new WitherAccessLevel(this.isNone, this.isPrivate, isPackage, this.isProtected, this.isPublic, this.value);
	}
	/**
	 * @return a clone of this object, except with this updated property (returns {@code this} if an identical value is passed).
	 */
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	protected WitherAccessLevel withProtected(final boolean isProtected) {
		return this.isProtected == isProtected ? this : new WitherAccessLevel(this.isNone, this.isPrivate, this.isPackage, isProtected, this.isPublic, this.value);
	}
	/**
	 * @return a clone of this object, except with this updated property (returns {@code this} if an identical value is passed).
	 */
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public WitherAccessLevel withPublic(final boolean isPublic) {
		return this.isPublic == isPublic ? this : new WitherAccessLevel(this.isNone, this.isPrivate, this.isPackage, this.isProtected, isPublic, this.value);
	}
	/**
	 * @return a clone of this object, except with this updated property (returns {@code this} if an identical value is passed).
	 */
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public WitherAccessLevel withValue(final boolean value) {
		return this.value == value ? this : new WitherAccessLevel(this.isNone, this.isPrivate, this.isPackage, this.isProtected, this.isPublic, value);
	}
}
