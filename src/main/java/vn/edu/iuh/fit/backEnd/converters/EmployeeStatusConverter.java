package vn.edu.iuh.fit.backEnd.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import vn.edu.iuh.fit.backEnd.enums.EmployeeStatus;

@Converter
public class EmployeeStatusConverter implements AttributeConverter<EmployeeStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(EmployeeStatus attribute) {
        if (attribute == null)
            return null;

        return attribute.getValue();
    }

    @Override
    public EmployeeStatus convertToEntityAttribute(Integer dbData) {
        if (dbData == 1)
            return EmployeeStatus.WORKING;
        if (dbData == 0)
            return EmployeeStatus.TEMPORARY_LAYOFF;
        if (dbData == -1)
            return EmployeeStatus.RESIGN;
        return null;
    }
}

