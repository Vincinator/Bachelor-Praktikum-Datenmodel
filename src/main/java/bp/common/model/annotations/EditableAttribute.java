package bp.common.model.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import bp.common.model.AttributeTypes;
/**
 * Created by Vincent on 27.06.2017.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EditableAttribute {
    String name();
    AttributeTypes type();
    String validoptions();
    
}
