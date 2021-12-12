diff --git a/src/core/lombok/javac/apt/LombokFileObjects.java b/src/core/lombok/javac/apt/LombokFileObjects.java
index ef73573..7184629 100644
--- a/src/core/lombok/javac/apt/LombokFileObjects.java
+++ b/src/core/lombok/javac/apt/LombokFileObjects.java
@@ -120,23 +120,23 @@
 					return new Java9Compiler(jfm);
 				}
 			}
-			catch (Exception e) {}
+			catch (Throwable e) {}
 			return Compiler.JAVAC7;
 		}
 		if (KNOWN_JAVA9_FILE_MANAGERS.contains(jfmClassName)) {
 			try {
 				return new Java9Compiler(jfm);
 			}
-			catch (Exception e) {}
+			catch (Throwable e) {}
 		}
 		try {
 			if (Class.forName("com.sun.tools.javac.file.BaseFileObject") == null) throw new NullPointerException();
 			return Compiler.JAVAC7;
-		} catch (Exception e) {}
+		} catch (Throwable e) {}
 		try {
 			if (Class.forName("com.sun.tools.javac.util.BaseFileObject") == null) throw new NullPointerException();
 			return Compiler.JAVAC6;
-		} catch (Exception e) {}
+		} catch (Throwable e) {}
 		
 		StringBuilder sb = new StringBuilder(jfmClassName);
 		if (jfm != null) {
