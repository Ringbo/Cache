diff --git a/platform-tests/src/test/java/org/junit/platform/commons/util/ReflectionUtilsTests.java b/platform-tests/src/test/java/org/junit/platform/commons/util/ReflectionUtilsTests.java
index 6babeb0..8d1c05d 100644
--- a/platform-tests/src/test/java/org/junit/platform/commons/util/ReflectionUtilsTests.java
+++ b/platform-tests/src/test/java/org/junit/platform/commons/util/ReflectionUtilsTests.java
@@ -253,7 +253,7 @@
 
 		Field field = MyClass.class.getDeclaredField("instanceField");
 		assertThat(tryToReadFieldValue(field, instance).get()).isEqualTo(42);
-		assertThrows(NullPointerException.class, () -> tryToReadFieldValue(field, null).get());
+		assertThrows(PreconditionViolationException.class, () -> tryToReadFieldValue(field, null).get());
 	}
 
 	@Test
