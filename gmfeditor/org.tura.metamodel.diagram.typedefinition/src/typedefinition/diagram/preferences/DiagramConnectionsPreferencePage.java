/*
 * 
 */
package typedefinition.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import typedefinition.diagram.part.DomainDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(DomainDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}