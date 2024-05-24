package cn.hamm.airpower.validate.dictionary;

import cn.hamm.airpower.interfaces.IDictionary;
import cn.hamm.airpower.util.Utils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * <h1>枚举字典验证实现类</h1>
 *
 * @author Hamm.cn
 */
public class DictionaryAnnotationValidator implements ConstraintValidator<Dictionary, Integer> {
    /**
     * <h2>标记的枚举类</h2>
     */
    private Class<? extends IDictionary> enumClazz = null;

    /**
     * <h2>验证</h2>
     *
     * @param value   验证的值
     * @param context 验证器会话
     * @return 验证结果
     */
    @Contract("null, _ -> true")
    @Override
    public final boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (null == value) {
            return true;
        }
        return Objects.nonNull(Utils.getDictionaryUtil().getDictionary(enumClazz, value));
    }

    /**
     * <h2>初始化</h2>
     *
     * @param dictionary 字典类
     */
    @Contract(mutates = "this")
    @Override
    public final void initialize(@NotNull Dictionary dictionary) {
        enumClazz = dictionary.value();
    }
}