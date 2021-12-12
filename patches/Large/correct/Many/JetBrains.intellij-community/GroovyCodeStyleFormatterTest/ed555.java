diff --git a/plugins/groovy/test/org/jetbrains/plugins/groovy/lang/formatter/GroovyCodeStyleFormatterTest.java b/plugins/groovy/test/org/jetbrains/plugins/groovy/lang/formatter/GroovyCodeStyleFormatterTest.java
index 981311c..06eede2 100644
--- a/plugins/groovy/test/org/jetbrains/plugins/groovy/lang/formatter/GroovyCodeStyleFormatterTest.java
+++ b/plugins/groovy/test/org/jetbrains/plugins/groovy/lang/formatter/GroovyCodeStyleFormatterTest.java
@@ -46,7 +46,7 @@
       final String[] strings = matcher.group(1).split("=");
       String name = strings[0];
       final CodeStyleSettings settings = CodeStyleSettingsManager.getSettings(getProject());
-      final Field field = CodeStyleSettings.class.getDeclaredField(name);
+      final Field field = CodeStyleSettings.class.getField(name);
       final String value = strings[1];
       if ("true".equals(value) || "false".equals(value)) {
         field.set(settings, Boolean.parseBoolean(value));
@@ -55,7 +55,7 @@
           field.set(settings, Integer.parseInt(value));
         }
         catch (NumberFormatException e) {
-          field.set(settings, CodeStyleSettings.class.getDeclaredField(value).get(value));
+          field.set(settings, CodeStyleSettings.class.getField(value).get(value));
         }
       }
       input = input.substring(matcher.end());
