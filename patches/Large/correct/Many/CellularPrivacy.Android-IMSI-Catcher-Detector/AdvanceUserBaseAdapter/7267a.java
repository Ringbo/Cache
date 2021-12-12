diff --git a/app/src/main/java/com/SecUpwN/AIMSICD/smsdetection/AdvanceUserBaseAdapter.java b/app/src/main/java/com/SecUpwN/AIMSICD/smsdetection/AdvanceUserBaseAdapter.java
index 0918dd7..14d5323 100644
--- a/app/src/main/java/com/SecUpwN/AIMSICD/smsdetection/AdvanceUserBaseAdapter.java
+++ b/app/src/main/java/com/SecUpwN/AIMSICD/smsdetection/AdvanceUserBaseAdapter.java
@@ -45,7 +45,7 @@
 	public View getView(int position, View convertView, ViewGroup parent) {
 		ViewHolder holder;
 		if (convertView == null) {
-			convertView = l_Inflater.inflate(R.layout.adv_user_strings_list, parent);
+			convertView = l_Inflater.inflate(R.layout.adv_user_strings_list, parent, false);
 			holder = new ViewHolder();
             holder.tv_detection_string  = (TextView)convertView.findViewById(R.id.tv_adv_list_det_str);
             holder.tv_detection_type  = (TextView)convertView.findViewById(R.id.tv_adv_list_det_type);
