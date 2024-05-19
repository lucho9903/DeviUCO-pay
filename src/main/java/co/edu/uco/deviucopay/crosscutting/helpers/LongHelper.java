package co.edu.uco.deviucopay.crosscutting.helpers;

public final class LongHelper {
    
    public static final Long ZERO = 0L;
    
    private LongHelper() {
        super();
    }
    
    public static final boolean isNull(final Long number) {
        return ObjectHelper.getObjectHelper().isNull(number);
    }
    
    public static final boolean isNullOrZero(final Long number) {
        return isNull(number) || ZERO.equals(number);
    }
    
    public static final Long getDefaultValue(final Long number, final Long defaultValue) {
        return ObjectHelper.getObjectHelper().getDefaultValue(number, defaultValue);
    }
    
    public static final Long getDefaultValue(final Long number) {
        return getDefaultValue(number, ZERO);
    }
    
    public static final Long add(final Long... numbers) {
        Long sum = 0L;
        
        if (!ObjectHelper.getObjectHelper().isNull(numbers)) {
            for (final Long number : numbers) {
                if (!isNull(number)) {
                    sum += number;
                }
            }
        }
        
        return sum;
    }
    
    public static final Long subtract(final Long minuend, final Long subtrahend) {
        Long defaultMinuend = getDefaultValue(minuend);
        Long defaultSubtrahend = getDefaultValue(subtrahend);
        
        return defaultMinuend - defaultSubtrahend;
    }
    
    public static final Long multiply(final Long... numbers) {
        Long product = 1L;
        
        if (!ObjectHelper.getObjectHelper().isNull(numbers)) {
            for (final Long number : numbers) {
                if (!isNull(number)) {
                    product *= number;
                }
            }
        }
        
        return product;
    }
    
    public static final Long divide(final Long dividend, final Long divisor) {
        if (isNullOrZero(divisor)) {
            throw new IllegalArgumentException("Divisor cannot be null or zero.");
        }
        
        Long defaultDividend = getDefaultValue(dividend);
        Long defaultDivisor = getDefaultValue(divisor);
        
        return defaultDividend / defaultDivisor;
    }
}
