package com.example.sudhirrawat.buildjavalogic;

import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import adapters.ProductsAdapter;
import models.ProductDataModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView icon;
    private List<String> stringList = new ArrayList<String>();
    private int [] numberArray = {1,3,5,6,-7,3,9};
    static int n1=0,n2=1,n3=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        int [] a = new int[10];
        int [] b = new int[100];
        a = b;
        b = a.clone();
        int count = 10;
        Log.e("numbers are:",""+ n1 + n2);
        printFibonacci(count - 2);
    }

    public void init() {
        icon = (ImageView) findViewById(R.id.iconJava);
        icon.setOnClickListener(this);
//reverseEachWordOfString("hello sudhir rawat");
        permuteString("","JSP" );
        checkDuplicateUsingAdd(numberArray);
    }

    public void findDuplicateChars(String str) {

        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        char[] chrs = str.toCharArray();
        for (Character ch : chrs) {
            if (dupMap.containsKey(ch)) {
                dupMap.put(ch, dupMap.get(ch) + 1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for (Character ch : keys) {
            if (dupMap.get(ch) > 1) {
                Log.e("" + ch, "" + dupMap.get(ch));
            }
        }
    }

    public static void permuteString(String beginningString, String endingString) {
        if (endingString.length() <= 1)
            System.out.println(beginningString + endingString);
        else
            for (int i = 0; i < endingString.length(); i++) {
                try {
                    String newString = endingString.substring(0, i) + endingString.substring(i + 1);
                    permuteString(beginningString + endingString.charAt(i), newString);
                } catch (StringIndexOutOfBoundsException exception) {
                    exception.printStackTrace();
                }
            }
    }

    static void reverseEachWordOfString(String inputString) {
        String[] words = inputString.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }

        System.out.println(inputString);
        System.out.println(reverseString);
        System.out.println("-------------------------");
    }

    public static boolean checkDuplicateUsingAdd(int[] input) {
        Set tempSet = new HashSet();
        for (int str : input) {
            if (!tempSet.add(str)) {
                Log.e("duplicate number is:", ""+ str);
                return true;
            }
        }
        return false;
    }

    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print("numbers are"+n3);
            printFibonacci(count-1);
        }
    }


    private static void StringPermutation(String permutation, String input)
    {
        if(input.length() == 0)
        {
            System.out.println(permutation);
        }
        else
        {
            for (int i = 0; i < input.length(); i++)
            {
                StringPermutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
            }
        }
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, JavaLogic.class);
        startActivity(i);
    }
}
