diff --git a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/DefaultCxfBinding.java b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/DefaultCxfBinding.java
index b04e3a4..8a63da2 100644
--- a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/DefaultCxfBinding.java
+++ b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/DefaultCxfBinding.java
@@ -392,7 +392,7 @@
         int i = 0;
         if (boi.getOutput() != null) {
             for (MessagePartInfo partInfo : boi.getOutput().getMessageParts()) {
-                if (elements.size() > i) {
+                if (elements != null && elements.size() > i) {
                     answer.put(partInfo, elements.get(i++));
                 }
             }
