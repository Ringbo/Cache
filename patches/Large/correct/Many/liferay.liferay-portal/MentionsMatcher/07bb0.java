diff --git a/modules/apps/mentions/mentions-service/src/main/java/com/liferay/mentions/util/impl/MentionsMatcher.java b/modules/apps/mentions/mentions-service/src/main/java/com/liferay/mentions/util/impl/MentionsMatcher.java
index ac48264..4310896 100644
--- a/modules/apps/mentions/mentions-service/src/main/java/com/liferay/mentions/util/impl/MentionsMatcher.java
+++ b/modules/apps/mentions/mentions-service/src/main/java/com/liferay/mentions/util/impl/MentionsMatcher.java
@@ -29,8 +29,7 @@
 	}
 
 	private static final Pattern _pattern = Pattern.compile(
-		"(?:\\s|^|\\]|>)([@|&#64;]([^(?:@|&#64;|>|\\[|\\s|,|.|<)]+))",
-		Pattern.CASE_INSENSITIVE);
+		"(?:\\s|^|\\]|>)(?:@|&#64;)((?:&(?!#64;)|[^@<>.,\\[\\]\\s])+)");
 
 	private static class MentionsIterable implements Iterable<String> {
 
@@ -76,7 +75,7 @@
 
 			_hasNext = null;
 
-			return _matcher.group(2);
+			return _matcher.group(1);
 		}
 
 		@Override
