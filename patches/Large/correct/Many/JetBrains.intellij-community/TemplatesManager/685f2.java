diff --git a/plugins/generate-tostring/src/org/jetbrains/java/generate/template/TemplatesManager.java b/plugins/generate-tostring/src/org/jetbrains/java/generate/template/TemplatesManager.java
index d6e3106..bea9456 100644
--- a/plugins/generate-tostring/src/org/jetbrains/java/generate/template/TemplatesManager.java
+++ b/plugins/generate-tostring/src/org/jetbrains/java/generate/template/TemplatesManager.java
@@ -135,7 +135,7 @@
                                        //hide setters from completion list
                                        return null;
                                      }
-                                     return method.getGenericReturnType().getTypeName() + " " + methodName + "();";
+                                     return method.getGenericReturnType().toString() + " " + methodName + "();";
                                    }
                                  });
       final String text = "interface " + elementClass.getSimpleName() + " {\n" + StringUtil.join(methodNames, "\n") + "}";
