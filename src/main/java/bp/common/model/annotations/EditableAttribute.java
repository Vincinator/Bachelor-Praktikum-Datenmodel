package bp.common.model.annotations;

/**
 * Created by Vincent on 27.06.2017.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EditableAttribute {
    String value();
}
