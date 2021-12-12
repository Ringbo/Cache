diff --git a/struts2/plugin/src/com/intellij/struts2/annotators/StrutsFileSetCheckingAnnotator.java b/struts2/plugin/src/com/intellij/struts2/annotators/StrutsFileSetCheckingAnnotator.java
index b400ec5..8ad4bb4 100644
--- a/struts2/plugin/src/com/intellij/struts2/annotators/StrutsFileSetCheckingAnnotator.java
+++ b/struts2/plugin/src/com/intellij/struts2/annotators/StrutsFileSetCheckingAnnotator.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2007 The authors
+ * Copyright 2010 The authors
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
@@ -184,7 +184,7 @@
                   return super.onChosen(selectedValue, finalChoice);
                 }
               };
-      JBPopupFactory.getInstance().createListPopup(step).showInBestPositionFor(DataManager.getInstance().getDataContext());
+      JBPopupFactory.getInstance().createListPopup(step).showInBestPositionFor(DataManager.getInstance().getDataContext(editor.getComponent()));
     }
   }
 
