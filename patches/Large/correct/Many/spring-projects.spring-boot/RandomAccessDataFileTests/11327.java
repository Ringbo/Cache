diff --git a/spring-boot-tools/spring-boot-loader/src/test/java/org/springframework/boot/loader/data/RandomAccessDataFileTests.java b/spring-boot-tools/spring-boot-loader/src/test/java/org/springframework/boot/loader/data/RandomAccessDataFileTests.java
index 3b0422d..1f5dd7e 100644
--- a/spring-boot-tools/spring-boot-loader/src/test/java/org/springframework/boot/loader/data/RandomAccessDataFileTests.java
+++ b/spring-boot-tools/spring-boot-loader/src/test/java/org/springframework/boot/loader/data/RandomAccessDataFileTests.java
@@ -87,28 +87,28 @@
 	@Test
 	public void fileNotNull() throws Exception {
 		this.thrown.expect(IllegalArgumentException.class);
-		this.thrown.equals("File must not be null");
+		this.thrown.expectMessage("File must not be null");
 		new RandomAccessDataFile(null);
 	}
 
 	@Test
 	public void fileExists() throws Exception {
 		this.thrown.expect(IllegalArgumentException.class);
-		this.thrown.equals("File must exist");
+		this.thrown.expectMessage("File must exist");
 		new RandomAccessDataFile(new File("/does/not/exist"));
 	}
 
 	@Test
 	public void fileNotNullWithConcurrentReads() throws Exception {
 		this.thrown.expect(IllegalArgumentException.class);
-		this.thrown.equals("File must not be null");
+		this.thrown.expectMessage("File must not be null");
 		new RandomAccessDataFile(null, 1);
 	}
 
 	@Test
 	public void fileExistsWithConcurrentReads() throws Exception {
 		this.thrown.expect(IllegalArgumentException.class);
-		this.thrown.equals("File must exist");
+		this.thrown.expectMessage("File must exist");
 		new RandomAccessDataFile(new File("/does/not/exist"), 1);
 	}
 
