diff --git a/reactor-core/src/test/java/reactor/HooksTest.java b/reactor-core/src/test/java/reactor/HooksTest.java
index 9d8ba90..89152c5 100644
--- a/reactor-core/src/test/java/reactor/HooksTest.java
+++ b/reactor-core/src/test/java/reactor/HooksTest.java
@@ -187,7 +187,7 @@
 
 		assertThat(hook.get()).isNotNull().isEqualTo(hook2.get());
 
-		Hooks.resetOnEachOperator();
+		Hooks.resetOnLastOperator();
 	}
 
 
