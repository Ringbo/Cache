diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/MavenDomElementDescriptorHolder.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/MavenDomElementDescriptorHolder.java
index 9a72ca5..5f4cf19 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/MavenDomElementDescriptorHolder.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/MavenDomElementDescriptorHolder.java
@@ -99,7 +99,7 @@
         public Result<XmlNSDescriptorImpl> compute() {
           return Result.create(doCreateDescriptor(kind), PsiModificationTracker.OUT_OF_CODE_BLOCK_MODIFICATION_COUNT);
         }
-      });
+      }, false);
       myDescriptorsMap.put(kind, result);
     }
     return result.getValue();
