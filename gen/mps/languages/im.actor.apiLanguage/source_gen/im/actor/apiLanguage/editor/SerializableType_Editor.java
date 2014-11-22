package im.actor.apiLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.editor.runtime.cells.BigCellUtil;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;

public class SerializableType_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createAlternation_mja8cp_a(editorContext, node);
  }

  private EditorCell createAlternation_mja8cp_a(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = SerializableType_Editor.renderingCondition_mja8cp_a0(node, editorContext);
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createError_mja8cp_a0(editorContext, node);
    } else {
      editorCell = this.createComponent_mja8cp_a0(editorContext, node);
    }
    EditorCell bigCell = BigCellUtil.findBigCell(editorCell, node);
    if (bigCell != null) {
      bigCell.setBig(true);
    }
    return editorCell;
  }

  private static boolean renderingCondition_mja8cp_a0(SNode node, EditorContext editorContext) {
    return "SerializableType".equals(node + "");
  }

  private EditorCell createError_mja8cp_a0(EditorContext editorContext, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(editorContext, node, "<no def>");
    editorCell.setCellId("Error_mja8cp_a0");
    return editorCell;
  }

  private EditorCell createComponent_mja8cp_a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
}
