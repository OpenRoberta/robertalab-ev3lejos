package de.fhg.iais.roberta.inter.mode.sensor;

import de.fhg.iais.roberta.inter.mode.general.IMode;

/**
 * The enumeration implementing this interface should contain all the color sensor modes available on the robot.
 *
 * @author kcvejoski
 */
public interface IColorSensorMode extends IMode {
    /**
     * @return array of values alternative to the enumeration value.
     */
    public String[] getValues();
}