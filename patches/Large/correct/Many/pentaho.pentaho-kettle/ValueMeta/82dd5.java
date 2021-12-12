diff --git a/src-core/org/pentaho/di/core/row/ValueMeta.java b/src-core/org/pentaho/di/core/row/ValueMeta.java
index f4dd911..3850ddc 100644
--- a/src-core/org/pentaho/di/core/row/ValueMeta.java
+++ b/src-core/org/pentaho/di/core/row/ValueMeta.java
@@ -2633,7 +2633,7 @@
 		    	throw new RuntimeException(toString()+" : There was a data type error: the data type of "+object.getClass().getName()+" object ["+object+"] does not correspond to value meta ["+toStringMeta()+"]");
 			}
         }
-    	xml.append(XMLHandler.closeTag(XML_META_TAG));
+    	xml.append(XMLHandler.closeTag(XML_DATA_TAG));
     	
     	return xml.toString();
     }
