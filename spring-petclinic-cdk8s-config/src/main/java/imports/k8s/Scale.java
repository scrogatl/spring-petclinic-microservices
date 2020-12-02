package imports.k8s;

/**
 * Scale represents a scaling request for a resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-30T16:28:28.125Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Scale")
public class Scale extends org.cdk8s.ApiObject {

    protected Scale(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Scale(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.autoscaling.v1.Scale" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public Scale(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable imports.k8s.ScaleOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.autoscaling.v1.Scale" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public Scale(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.Scale}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.Scale> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private imports.k8s.ScaleOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * Standard object metadata;
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object metadata;. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * defines the behavior of the scale.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
         * <p>
         * @return {@code this}
         * @param spec defines the behavior of the scale. This parameter is required.
         */
        public Builder spec(final imports.k8s.ScaleSpec spec) {
            this.options().spec(spec);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.Scale}.
         */
        @Override
        public imports.k8s.Scale build() {
            return new imports.k8s.Scale(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private imports.k8s.ScaleOptions.Builder options() {
            if (this.options == null) {
                this.options = new imports.k8s.ScaleOptions.Builder();
            }
            return this.options;
        }
    }
}
