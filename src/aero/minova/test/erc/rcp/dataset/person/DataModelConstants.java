/*******************************************************************************
 * Copyright (c) 2012, 2020 Original authors and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Original authors and others - initial API and implementation
 ******************************************************************************/
package aero.minova.test.erc.rcp.dataset.person;

public class DataModelConstants {

    public static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd";

    public static final int FIRSTNAME_COLUMN_POSITION = 0;
    public static final int LASTNAME_COLUMN_POSITION = 1;
    public static final int GENDER_COLUMN_POSITION = 2;
    public static final int MARRIED_COLUMN_POSITION = 3;
    public static final int BIRTHDAY_COLUMN_POSITION = 4;

    public static final int STREET_COLUMN_POSITION = 5;
    public static final int HOUSENUMBER_COLUMN_POSITION = 6;
    public static final int POSTALCODE_COLUMN_POSITION = 7;
    public static final int CITY_COLUMN_POSITION = 8;

    public static final int PERSON_NUMBER_OF_COLUMNS = 5;
    public static final int PERSONWITHADDRESS_NUMBER_OF_COLUMNS = 9;

    public static final String FIRSTNAME_PROPERTYNAME = "firstName";
    public static final String LASTNAME_PROPERTYNAME = "lastName";
    public static final String GENDER_PROPERTYNAME = "gender";
    public static final String MARRIED_PROPERTYNAME = "married";
    public static final String BIRTHDAY_PROPERTYNAME = "birthday";

    public static final String STREET_PROPERTYNAME = "street";
    public static final String HOUSENUMBER_PROPERTYNAME = "housenumber";
    public static final String POSTALCODE_PROPERTYNAME = "postalCode";
    public static final String CITY_PROPERTYNAME = "city";

    private static final String[] PERSON_PROPERTY_NAMES = {
            FIRSTNAME_PROPERTYNAME,
            LASTNAME_PROPERTYNAME,
            GENDER_PROPERTYNAME,
            MARRIED_PROPERTYNAME,
            BIRTHDAY_PROPERTYNAME
    };

    public static String[] getPersonPropertyNames() {
        return PERSON_PROPERTY_NAMES;
    }

    private static final String[] PERSONWITHADDRESS_PROPERTY_NAMES = {
            FIRSTNAME_PROPERTYNAME,
            LASTNAME_PROPERTYNAME,
            GENDER_PROPERTYNAME,
            MARRIED_PROPERTYNAME,
            BIRTHDAY_PROPERTYNAME,
            STREET_PROPERTYNAME,
            HOUSENUMBER_PROPERTYNAME,
            POSTALCODE_PROPERTYNAME,
            CITY_PROPERTYNAME
    };

    public static String[] getPersonwithaddressPropertyNames() {
        return PERSONWITHADDRESS_PROPERTY_NAMES;
    }
}
