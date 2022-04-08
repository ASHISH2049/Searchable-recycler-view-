//package com.ashishshs.custom_spinner24;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Dialog;
//import android.content.Context;
//import android.graphics.Color;
//import android.graphics.drawable.ColorDrawable;
//import android.os.Bundle;
//import android.text.Editable;
//import android.text.TextWatcher;
//import android.view.Display;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.EditText;
//import android.widget.Filter;
//import android.widget.ListView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Locale;
//
//
////https://stackoverflow.com/questions/8655616/how-to-add-search-to-a-list-view-android-sort-items-as-u-type
////https://stackoverflow.com/questions/32655695/how-do-i-search-any-character-in-my-search-strings
//
//
//
////https://www.mysamplecode.com/2012/07/android-listview-custom-layout-filter.html
////https://www.geeksforgeeks.org/how-to-implement-custom-searchable-spinner-in-android/
//public class MainActivity extends AppCompatActivity {
//    // Initialize variable
//    TextView textview;
//    ArrayList<String> arrayList, arrayList2;
//    ArrayList<String> arrayList3;
//    List<ModelClass> list;
//    Dialog dialog;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // assign variable
//        textview = findViewById(R.id.testView);
//
//        // initialize array list
//        arrayList = new ArrayList<>();
//        arrayList2 = new ArrayList<>();
//        arrayList3 = new ArrayList<>();
//
//        // set value in array list
//        arrayList.add("DSA");
//        arrayList.add("Complete");
//        arrayList.add("Amazon");
//        arrayList.add("Compiler");
//        arrayList.add("Git");
//        arrayList.add("Python");
//        arrayList.add("Operating");
//        arrayList.add("Theory");
//        arrayList.add("aaster of computer, mca");
//        arrayList.add("aaster of computer, (mca)");
//        arrayList.add("Adichunchanagiri University, Mandya");
//        arrayList.add("Adichunchanagiri University, Mandya");
//        arrayList.add("Adamas University, Kolkata");
//        arrayList.add("Adamas University, Kolkata");
//        arrayList.add("ARKA Jain University, Seraikela");
//        arrayList.add("AIPH University, Bhubaneswar");
//
////        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
//        arrayList2.add("121");
//        arrayList2.add("122");
//        arrayList2.add("4536");
//        arrayList2.add("3");
//        arrayList2.add("55");
//        arrayList2.add("67");
//        arrayList2.add("101");
//        arrayList2.add("56");
//
//
////        arrayList3.add(arrayList);
//
//
//        textview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Initialize dialog
//                dialog = new Dialog(MainActivity.this);
//
//                // set custom dialog
//                dialog.setContentView(R.layout.dialog_searchable_spinner);
//
//                // set custom height and width
//                dialog.getWindow().setLayout(650, 800);
//
//                // set transparent background
//                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//
//                // show dialog
//                dialog.show();
//
//                // Initialize and assign variable
////                EditText editText = dialog.findViewById(R.id.edit_text);
////                ListView listView = dialog.findViewById(R.id.list_view);
//
//                // Initialize array adapter
//                ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
////                MyAdapter adapter=new MyAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
//
//                // set adapter
////                listView.setAdapter(adapter);
////                editText.addTextChangedListener(new TextWatcher() {
////                    @Override
////                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
////
////                    }
////
////                    @Override
////                    public void onTextChanged(CharSequence s, int start, int before, int count) {
//////                        adapter.getFilter().filter(s);
////                    }
////
////                    //                    https://www.youtube.com/watch?v=GeO5F0nnzAw
//////                    https://demonuts.com/android-spinner-searchable/
////                    @Override
////                    public void afterTextChanged(Editable s) {
////                        adapter.getFilter().filter(s);
////////                        String text = editText.getText().toString().toLowerCase(Locale.getDefault());
////////                        adapter.filter(text);
//////                        ArrayList<String> type_name_filter = new ArrayList<String>();
//////
//////                        String text = s.toString();
//////
//////                        for (int i = 0; i < arrayList.size(); i++) {
//////
//////                            if ((arrayList.get(i).toLowerCase()).contains(text
//////                                    .toLowerCase())) {
//////                                type_name_filter.add(arrayList.get(i));
//////
//////                            }
//////                        }
//////
//////                        arrayList3 = type_name_filter;
////
//////                        adapter(arrayList3);
////
////
////                    }
////                });
//
//                editText.addTextChangedListener(new TextWatcher() {
//                    @Override
//                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                    }
//
//                    @Override
//                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                        list = new ArrayList<>();
//                    }
//
//                    @Override
//                    public void afterTextChanged(Editable editable) {
//
////                        filter(editable.toString());
//                    }
//                });
//
//                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                        // when item selected from list
//                        // set selected item on textView
//                        textview.setText("" + adapter.getItem(position));
//
//                        Toast.makeText(MainActivity.this, ""+arrayList2.get(arrayList.indexOf(adapter.getItem(position))), Toast.LENGTH_SHORT).show();
//
//                        // Dismiss dialog
//                        dialog.dismiss();
//                    }
//                });
//            }
//        });
//
//    }
//
//
////    private void filter(String text) {
////
////        try {
////
////            List<ModelClass> filterList = new ArrayList<>();
////
////            for (ModelClass items : list) {
////                if (items.getList().toLowerCase().contains(text.toLowerCase())) {
////                    filterList.add(items);
////                }
////            }
////
////            if (filterList.isEmpty()) {
////
////            } else {
////
////                adapter.filterList(filterList);
////            }
////        }catch (Exception e){
////
////            Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_LONG).show();
////        }
////    }
////
////
////    private void filterList(List<ArrayList> filterList){
////
////        list=filterList;
////        notifyDataSetChanged();
////    }
//
//
////    private void adapter(ArrayList<String> arrayList3) {
////        l1.setAdapter(new ArrayAdapter<String>(this,
////                android.R.layout.simple_list_item_1, data));
////    }
////    ///*********
////    private class MyAdapter extends ArrayAdapter<String> {
////
////        private ArrayList<String> itemList;
////        private final ArrayList<String> originalItemList;
////        private MyFilter filter;
////
////        public MyAdapter(Context context, int textViewResourceId,
////                         ArrayList<String> arrayList) {
////            super(context, textViewResourceId, arrayList);
////            this.itemList = new ArrayList<String>();
////            this.itemList.addAll(arrayList);
////            this.originalItemList = new ArrayList<String>();
////            this.originalItemList.addAll(arrayList);
////        }
////
////        @Override
////        public Filter getFilter() {
////            if (filter == null) {
////                filter = new MyFilter();
////            }
////            return filter;
////        }
////
////
////
////        private class MyFilter extends Filter
////        {
////
////            @Override
////            protected FilterResults performFiltering(CharSequence constraint) {
////
////                String key = constraint.toString().toLowerCase();
////                FilterResults result = new FilterResults();
////                if(key != null && key.length() > 0)
////                {
////                    ArrayList<String> filteredItems = new ArrayList<String>();
////
////                    for(int i = 0, l = originalItemList.size(); i < l; i++)
////                    {
////                        String tempItem = originalItemList.get(i).toLowerCase();
////                        if(tempItem.indexOf(key)>-1)
////                            filteredItems.add(tempItem);
////                    }
//////                    filteredItems.add("Ashish - Temp data");
////                    result.count = filteredItems.size();
////                    result.values = filteredItems;
////                }
////                else
////                {
////
//////                    result.count = originalItemList.size();
//////                    result.values = originalItemList;
////
////                    synchronized(this)
////                    {
////                        result.values = originalItemList;
////                        result.count = originalItemList.size();
////                    }
////                }
////                return result;
////            }
////
////            @SuppressWarnings("unchecked")
////            @Override
////            protected void publishResults(CharSequence constraint,
////                                          FilterResults results) {
////
////                itemList = (ArrayList<String>)results.values;
////                notifyDataSetChanged();
////                clear();
////                for(int i = 0, l = itemList.size(); i < l; i++)
////                    add(itemList.get(i));
////                notifyDataSetInvalidated();
////            }
////        }
////    ///*********
//
//    //}
//
//
//
//}
