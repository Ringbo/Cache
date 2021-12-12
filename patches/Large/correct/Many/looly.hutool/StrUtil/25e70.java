diff --git a/hutool-core/src/main/java/com/xiaoleilu/hutool/util/StrUtil.java b/hutool-core/src/main/java/com/xiaoleilu/hutool/util/StrUtil.java
index 70c0e85..1f89448 100644
--- a/hutool-core/src/main/java/com/xiaoleilu/hutool/util/StrUtil.java
+++ b/hutool-core/src/main/java/com/xiaoleilu/hutool/util/StrUtil.java
@@ -765,9 +765,9 @@
 		final String str2 = str.toString();
 		final String prefix2 = prefix.toString();
 		if (false == str2.startsWith(prefix2)) {
-			return prefix2 + str2;
+			return prefix2.concat(str2);
 		}
-		return prefix2;
+		return str2;
 	}
 
 	/**
@@ -785,7 +785,7 @@
 		final String str2 = str.toString();
 		final String suffix2 = suffix.toString();
 		if (false == str2.endsWith(suffix2)) {
-			return str2 + suffix2;
+			return str2.concat(suffix2);
 		}
 		return str2;
 	}
