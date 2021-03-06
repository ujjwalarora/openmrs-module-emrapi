/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.emrapi.encounter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EncounterSearchParameters {
    private String visitUuid;
    private String encounterDate;
    private Boolean includeAll;

    public String getVisitUuid() {
        return visitUuid;
    }

    public void setVisitUuid(String visitUuid) {
        this.visitUuid = visitUuid;
    }

    public String getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(String encounterDate) {
        this.encounterDate = encounterDate;
    }

    public Boolean getIncludeAll() {
        return includeAll;
    }

    public void setIncludeAll(Boolean includeAll) {
        this.includeAll = includeAll;
    }

    public Date getEncounterDateAsDate() {
        if (encounterDate == null) return null;
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(encounterDate);
        } catch (ParseException e) {
            // should never occur as web layer does the data checks.
            return null;
        }
    }
}
