package org.tura.sirius.diagram.producer.tura.config.items;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.sirius.table.metamodel.table.description.BackgroundStyleDescription;
import org.eclipse.sirius.table.metamodel.table.description.CreateLineTool;
import org.eclipse.sirius.table.metamodel.table.description.DescriptionFactory;
import org.eclipse.sirius.table.metamodel.table.description.ForegroundStyleDescription;
import org.tura.sirius.dsl.config.LineConfiguration;
import org.tura.sirius.dsl.table.tLine;

public class Table_Message_LanguageConfigurator
  implements LineConfiguration
{
  public static tLine create()
  {
    return new tLine(new Table_Message_LanguageConfigurator());
  }
  
  public String getDomainClass()
  {
    return "message.Translation";
  }
  
  public String getCandidates()
  {
    return "feature:translatioins";
  }
  
  public String getName()
  {
    return "Language";
  }
  
  public String getHeaderLabelExpression()
  {
    return "service:getLangName";
  }
  
  public BackgroundStyleDescription getBackgroundStyle()
  {
    BackgroundStyleDescription style = DescriptionFactory.eINSTANCE.createBackgroundStyleDescription();
    return style;
  }
  
  public ForegroundStyleDescription getForegroundStyle()
  {
    ForegroundStyleDescription style = DescriptionFactory.eINSTANCE.createForegroundStyleDescription();
    return style;
  }
  
  public List<CreateLineTool> getCreateTools()
  {
		return new ArrayList<CreateLineTool>();
  }
}
