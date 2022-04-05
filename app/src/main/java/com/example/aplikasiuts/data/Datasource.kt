package com.example.aplikasiuts.data

import com.example.aplikasiuts.R
import com.example.aplikasiuts.model.AplikasiUTSProto1

class Datasource {
    fun loadAplikasiUTSProto1(): List<AplikasiUTSProto1>{
        return listOf<AplikasiUTSProto1>(
            AplikasiUTSProto1(R.string.text1, R.drawable.beat),
            AplikasiUTSProto1(R.string.text2, R.drawable.beatstreet),
            AplikasiUTSProto1(R.string.text3, R.drawable.genio),
            AplikasiUTSProto1(R.string.text4, R.drawable.scoopy),
            AplikasiUTSProto1(R.string.text5, R.drawable.vario125),
            AplikasiUTSProto1(R.string.text6, R.drawable.vario160),
            AplikasiUTSProto1(R.string.text7, R.drawable.pcx),
            AplikasiUTSProto1(R.string.text8, R.drawable.adv150),
            AplikasiUTSProto1(R.string.text9, R.drawable.pcxehex),
            AplikasiUTSProto1(R.string.text10, R.drawable.forza)
        )
    }
}