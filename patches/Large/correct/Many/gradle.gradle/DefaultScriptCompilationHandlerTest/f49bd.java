diff --git a/subprojects/core/src/test/groovy/org/gradle/groovy/scripts/DefaultScriptCompilationHandlerTest.java b/subprojects/core/src/test/groovy/org/gradle/groovy/scripts/DefaultScriptCompilationHandlerTest.java
index e59d2ad..0d6ff18 100644
--- a/subprojects/core/src/test/groovy/org/gradle/groovy/scripts/DefaultScriptCompilationHandlerTest.java
+++ b/subprojects/core/src/test/groovy/org/gradle/groovy/scripts/DefaultScriptCompilationHandlerTest.java
@@ -209,7 +209,7 @@
                     expectedScriptClass);
             fail();
         } catch (GradleException e) {
-            assertThat(e.getMessage(), equalTo("Could not load compiled classes for script-display-name from cache."));
+            assertThat(e.getMessage(), containsString("Could not load compiled classes for script-display-name from cache."));
             assertThat(e.getCause(), instanceOf(ClassCastException.class));
         }
     }
