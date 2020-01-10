/*
 * Bundle Commons is part of the OrbisGIS platform
 *
 * OrbisGIS is a java GIS application dedicated to research in GIScience.
 * OrbisGIS is developed by the GIS group of the DECIDE team of the
 * Lab-STICC CNRS laboratory, see <http://www.lab-sticc.fr/>.
 *
 * The GIS group of the DECIDE team is located at :
 *
 * Laboratoire Lab-STICC – CNRS UMR 6285
 * Equipe DECIDE
 * UNIVERSITÉ DE BRETAGNE-SUD
 * Institut Universitaire de Technologie de Vannes
 * 8, Rue Montaigne - BP 561 56017 Vannes Cedex
 *
 * Commons is distributed under LGPL 3 license.
 *
 * Copyright (C) 2018-2020 CNRS (Lab-STICC UMR CNRS 6285)
 *
 *
 * Commons is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * Commons is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Commons. If not, see <http://www.gnu.org/licenses/>.
 *
 * For more information, please consult: <http://www.orbisgis.org/>
 * or contact directly:
 * info_at_ orbisgis.org
 */
package org.orbisgis.commons.utilities;

import org.orbisgis.commons.annotations.Nullable;

import java.security.InvalidParameterException;

/**
 * Utility class for checking values, parameters ...
 *
 * @author Sylvain PALOMINOS (Lab-STICC UBS 2020)
 */
public class CheckUtils {

    /**
     * Check that the given value is not null. If null, throws an {@link InvalidParameterException}.
     *
     * @param value Value to check.
     * @throws InvalidParameterException Exception thrown in case of null value.
     */
    public static void checkNotNull(@Nullable Object value) throws InvalidParameterException {
        if (value == null) {
            throw new InvalidParameterException();
        }
    }

    /**
     * Check that the given value is not null. If null, throws an {@link InvalidParameterException} with the given
     * message.
     *
     * @param value   Value to check.
     * @param message Message to put in the {@link InvalidParameterException}.
     * @throws InvalidParameterException Exception thrown in case of null value with the given message.
     */
    public static void checkNotNull(@Nullable Object value, @Nullable String message) throws InvalidParameterException {
        if (message == null) {
            checkNotNull(value);
        } else if (value == null) {
            throw new InvalidParameterException(message);
        }
    }
}
