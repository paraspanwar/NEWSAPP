package com.example.newsapp_ui.base_fragments

import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.newsapp_ui.NAHostActivity


open class BaseFragment<T : ViewDataBinding>(private val mLayoutInflateData: Int) : Fragment() {
    private val mContext = requireContext()

    private val _mFragmentRootView: T? = null
    protected val mFragmentRootView get() = _mFragmentRootView
    protected val mSharedViewModel by lazy{ (activity as NAHostActivity).mSharedViewModel}

//    internal val mSharedViewModel: SharedViewModel by activityViewModels<SharedViewModel> {
//        CustomViewModelFactory(mContext = mContext)
//    }
}