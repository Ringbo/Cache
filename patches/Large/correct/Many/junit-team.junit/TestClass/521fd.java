diff --git a/src/org/junit/internal/runners/TestClass.java b/src/org/junit/internal/runners/TestClass.java
index 1cf2f92..a6e9617 100644
--- a/src/org/junit/internal/runners/TestClass.java
+++ b/src/org/junit/internal/runners/TestClass.java
@@ -23,11 +23,11 @@
 		return getAnnotatedMethods(Test.class);
 	}
 
-	public List<Method> getBefores() {
+	List<Method> getBefores() {
 		return getAnnotatedMethods(BeforeClass.class);
 	}
 
-	public List<Method> getAfters() {
+	List<Method> getAfters() {
 		return getAnnotatedMethods(AfterClass.class);
 	}
 	
