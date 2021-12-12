diff --git a/src/core/org/apache/jmeter/save/ScriptWrapperConverter.java b/src/core/org/apache/jmeter/save/ScriptWrapperConverter.java
index 25c4435..98ec297 100644
--- a/src/core/org/apache/jmeter/save/ScriptWrapperConverter.java
+++ b/src/core/org/apache/jmeter/save/ScriptWrapperConverter.java
@@ -61,7 +61,7 @@
       ScriptWrapper wrap = (ScriptWrapper)arg0;
       writer.addAttribute("version",SaveService.version);
       writer.addAttribute("properties",SaveService.propertiesVersion);
-      writer.startNode(classMapper.lookupName(wrap.testPlan.getClass()));
+      writer.startNode(classMapper.serializedClass(wrap.testPlan.getClass()));
       context.convertAnother(wrap.testPlan);
       writer.endNode();
    }
@@ -84,9 +84,9 @@
       String classAttribute = reader.getAttribute("class");
       Class type;
       if (classAttribute == null) {
-          type = classMapper.lookupType(reader.getNodeName());
+          type = classMapper.realClass(reader.getNodeName());
       } else {
-          type = classMapper.lookupType(classAttribute);
+          type = classMapper.realClass(classAttribute);
       }
       return type;
    }
