package org.tura.platform.datacontrol.shift.rules.update;

import java.util.List;

import org.josql.QueryExecutionException;
import org.josql.QueryParseException;
import org.tura.platform.datacontrol.shift.Element;
import org.tura.platform.datacontrol.shift.ShiftControl;
import org.tura.platform.datacontrol.shift.rules.Rule;

public class PositionElementExistsUpdateRule extends Rule{

	@Override
	public boolean guard(ShiftControl shiftControl, List<Object> result,
			int position) {

		if (shiftControl.getShiftTracker().size() == 0 || result.size() == 0 )
			return false;

		Element element = (Element) result.get(0);
		if (element.getActualPosition() == position) {
			return true;
		}
		return false;
	}

	@Override
	public void execute(ShiftControl shiftControl, List<Object> result,
			int position) throws QueryParseException, QueryExecutionException {

		Element element = (Element) result.get(0);
		element.setModified(true);
		
	}

}