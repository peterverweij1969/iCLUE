﻿/*
 * Copyright 2014 Alterra, Wageningen UR
 * 
 * Licensed under the EUPL, Version 1.1 or – as soon they
 * will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the
 * Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl5
 * 
 * Unless required by applicable law or agreed to in
 * writing, software distributed under the Licence is
 * distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 * See the Licence for the specific language governing
 * permissions and limitations under the Licence.
 */

package nl.wur.iclue.model.demand;

/**
 *
 * @author Johnny te Roller
 */
public class AbsoluteDeviationValidator extends DemandValidator {

    private final int acceptableAbsoluteDeviation;

    public AbsoluteDeviationValidator(int demand, int acceptableAbsoluteDeviation) {
        super(demand);
        this.acceptableAbsoluteDeviation = acceptableAbsoluteDeviation;
    }

    
    @Override
    protected double getAllocatedMinAmountToBeValid() {
        return (double)getDemand() - acceptableAbsoluteDeviation;
    }
    
    @Override
    protected double getAllocatedMaxAmountToBeValid() {
        return (double)getDemand() + acceptableAbsoluteDeviation;
    }

}
