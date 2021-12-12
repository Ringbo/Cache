diff --git a/src/org/parosproxy/paros/model/Session.java b/src/org/parosproxy/paros/model/Session.java
index f991b32..96ca582 100644
--- a/src/org/parosproxy/paros/model/Session.java
+++ b/src/org/parosproxy/paros/model/Session.java
@@ -55,6 +55,7 @@
 // ZAP: 2015/10/21 Issue 1576: Support data driven content
 // ZAP: 2015/12/14 Issue 2119: Context's description not imported
 // ZAP: 2016/02/26 Issue 2273: Clear stats on session init
+// ZAP: 2016/05/02 Issue 2451: Only a single Data Driven Node can be saved in a context
 
 package org.parosproxy.paros.model;
 
@@ -1255,7 +1256,7 @@
 		config.setProperty(Context.CONTEXT_CONFIG_POSTPARSER_CLASS, c.getPostParamParser().getClass().getCanonicalName());
 		config.setProperty(Context.CONTEXT_CONFIG_POSTPARSER_CONFIG, c.getPostParamParser().getConfig());
 		for (StructuralNodeModifier snm : c.getDataDrivenNodes()) {
-			config.setProperty(Context.CONTEXT_CONFIG_DATA_DRIVEN_NODES, snm.getConfig());
+			config.addProperty(Context.CONTEXT_CONFIG_DATA_DRIVEN_NODES, snm.getConfig());
 		}
 		
 		model.exportContext(c, config);
