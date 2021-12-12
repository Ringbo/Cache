diff --git a/java/java-tests/testSrc/com/intellij/codeInsight/daemon/HighlightStressTest.java b/java/java-tests/testSrc/com/intellij/codeInsight/daemon/HighlightStressTest.java
index 12d72c9..a717ecf 100644
--- a/java/java-tests/testSrc/com/intellij/codeInsight/daemon/HighlightStressTest.java
+++ b/java/java-tests/testSrc/com/intellij/codeInsight/daemon/HighlightStressTest.java
@@ -237,7 +237,7 @@
       }
       String qualifiedName = aClass.getQualifiedName();
       if (qualifiedName.startsWith("java.lang.invoke")) continue; // java.lang.invoke.MethodHandle has weird access attributes in recent rt.jar which causes spurious highlighting errors
-      if ("Sink".equals(aClass.getName())) continue;
+      if (qualifiedName.contains(".Sink")) continue; // Sink has weird access in class files
       imports.append("import " + qualifiedName + ";\n");
       usages.append("/**/ "+aClass.getName() + " var" + v + " = null; var" + v + ".toString();\n");
       aClasses.add(aClass);
@@ -248,7 +248,7 @@
     WriteCommandAction.runWriteCommandAction(null, () -> getEditor().getDocument().setText(text));
 
     List<HighlightInfo> errors = DaemonAnalyzerTestCase.filter(doHighlighting(), HighlightSeverity.WARNING);
-    assertEmpty(errors);
+    assertEmpty(text, errors);
     Random random = new Random();
     int unused = 0;
     for (int i = 0; i < 100; i++) {
