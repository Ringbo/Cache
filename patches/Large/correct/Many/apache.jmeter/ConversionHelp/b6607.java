diff --git a/src/core/org/apache/jmeter/save/converters/ConversionHelp.java b/src/core/org/apache/jmeter/save/converters/ConversionHelp.java
index 9c8f2dc..81b4897 100644
--- a/src/core/org/apache/jmeter/save/converters/ConversionHelp.java
+++ b/src/core/org/apache/jmeter/save/converters/ConversionHelp.java
@@ -230,7 +230,7 @@
         if (name.length() != 0 && newName.length()==0) {
             return null;
         }
-        return name;
+        return newName;
     }
 
     /**
