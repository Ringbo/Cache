diff --git a/src/org/zaproxy/zap/extension/script/ScriptType.java b/src/org/zaproxy/zap/extension/script/ScriptType.java
index 9561e9a..9187275 100644
--- a/src/org/zaproxy/zap/extension/script/ScriptType.java
+++ b/src/org/zaproxy/zap/extension/script/ScriptType.java
@@ -20,7 +20,7 @@
 	private Set<String> capabilitiesSet = new HashSet<String>();
 	
 	public ScriptType(String name, String i18nKey, ImageIcon icon, boolean isEnableable) {
-		this(i18nKey, i18nKey, icon, isEnableable, null);
+		this(name, i18nKey, icon, isEnableable, null);
 	}
 
 	public ScriptType(String name, String i18nKey, ImageIcon icon, boolean isEnableable, String[] capabilities) {
