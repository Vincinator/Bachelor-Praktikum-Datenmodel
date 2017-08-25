package bp.common.model.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * Created by Vincent on 27.06.2017.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EditableAttribute {
    String value();
}
