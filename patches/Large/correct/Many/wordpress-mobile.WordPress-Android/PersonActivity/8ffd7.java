diff --git a/WordPress/src/main/java/org/wordpress/android/ui/people/PersonActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/people/PersonActivity.java
index 676a96e..6575f7b 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/people/PersonActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/people/PersonActivity.java
@@ -18,13 +18,13 @@
 public class PersonActivity extends AppCompatActivity {
     public static final String EXTRA_PERSON_ID = "EXTRA_PERSON_ID";
 
-    private int mPersonId;
+    private long mPersonId;
 
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
 
-        mPersonId = getIntent().getExtras().getInt(EXTRA_PERSON_ID);
+        mPersonId = getIntent().getExtras().getLong(EXTRA_PERSON_ID);
 
         ActionBar actionBar = getSupportActionBar();
         if (actionBar != null) {
@@ -69,7 +69,7 @@
             imgAvatar.setImageUrl(avatarUrl, WPNetworkImageView.ImageType.AVATAR);
             txtDisplayName.setText(person.getDisplayName());
             txtUsername.setText(person.getUsername());
-            txtRole.setText(Role.toString(this, person.getRole()));
+            txtRole.setText(Role.getLabel(this, person.getRole()));
             txtRemove.setText(String.format(getString(R.string.remove_user), person.getFirstName().toUpperCase()));
 
             txtRemove.setOnClickListener(new View.OnClickListener() {
