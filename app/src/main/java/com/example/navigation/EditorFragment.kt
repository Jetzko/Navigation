package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class EditorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_editor, container, false)
        val button = view.findViewById<Button>(R.id.editor_toHomeButton)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_editorFragment_to_homeFragment)
        }
        return view
    }
    }
