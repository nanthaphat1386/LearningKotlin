package com.example.wordsapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment

class LetterListFragment : Fragment() {
    private var _binding : LetterListFragment? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }


}