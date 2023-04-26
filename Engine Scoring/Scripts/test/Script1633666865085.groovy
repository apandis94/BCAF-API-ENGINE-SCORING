import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WS.sendRequest(findTestObject('Search_ME', [('MID') : MID, ('sourceapps') : sourceapps, ('ip') : ip, ('userid') : userid
            , ('branch') : branch, ('tipekons') : tipekons, ('marital') : marital, ('penjamin') : penjamin, ('tipepenjamin') : tipepenjamin
            , ('cluster') : cluster, ('custname') : custname, ('id_type') : id_type, ('id_no') : id_no, ('birthplace') : 'Bogor'
            , ('birthdate') : '10-06-1995', ('alamatktp') : 'CILEBUT POS', ('kelurahan') : 'CILEBUT TIMUR', ('kecamatan') : 'SUKARAJA'
            , ('kabupaten') : 'KABUPATEN', ('provinsi') : 'PROVINSI JAWA BARAT', ('kodepos') : '10130', ('jenkel') : 'Laki-laki'
            , ('supperson') : '', ('namaibu') : 'Leni', ('agama') : 'Islam', ('job') : 'Wiraswasta', ('ecocode') : '111202'
            , ('est_since') : '2008', ('jenisusaha') : 'Makanan', ('jabatan') : 'Pemilik', ('income') : '25,000,000', ('alamat') : ''
            , ('fax') : '', ('kodepos1') : '', ('kodetlp') : '', ('tlpno') : '', ('ext') : '', ('spouse_name') : '', ('spouse_idtype') : ''
            , ('spouse_jenkel') : '', ('spouse_idno') : '', ('spouse_agama') : '', ('spouse_birthdate') : '', ('spouse_birthplace') : ''
            , ('spouse_alamat') : '', ('spouse_kel') : '', ('spouse_kec') : '', ('spouse_kab') : '', ('spouse_prov') : ''
            , ('spouse_occ_ktp') : '', ('spouse_nama_occ') : '', ('spouse_jabatan') : '', ('spouse_occ_kartunama') : '', ('spouse_alamat_occ') : ''
            , ('spouse_fax') : '', ('spouse_kec_occ') : '', ('spouse_kodepos_occ') : '', ('spouse_kodetlp_occ') : '', ('spouse_notlp_occ') : ''
            , ('spouse_ext_occ') : '', ('dealername') : 'Wahana Persada Jakarta', ('dealerbranch') : 'W073-Wahana Persada Jakarta'
            , ('dealer_addr') : 'Jln. Alternatif Cibubur Rt. 001 Rw 007, Kampung Nagewer', ('dealer_kota') : 'Bogor', ('dealer_hp') : '0218234370'
            , ('dealer_fax') : '02182494927', ('dealer_auth') : '1', ('dealer_norek') : '7160051510', ('car_cond') : 'NEW'
            , ('brand') : 'DATSUN', ('model') : 'GO PANCA', ('type') : 'GO PANCA T 1.2 M/T', ('year') : '2020', ('kind') : 'Mb. Penumpang'
            , ('purpose') : 'Personal', ('color') : 'Hitam', ('engineno') : 'e53737', ('bodyno') : 'b63737', ('bpkb_owner') : 'AHMAD'
            , ('policeno') : '', ('bpkbno') : '', ('otr') : '250000000', ('dp') : '75000000', ('dp_percent') : '30', ('principal') : '175000000'
            , ('res_value') : '', ('tenor') : '36', ('flatrate') : '2.999999', ('effrate') : '6.016893', ('installment') : '5298611'
            , ('loan_type') : 'In Advance', ('outstanding') : '', ('biaya_pp') : '13839000', ('adm_fee') : '1000000', ('carins_fee') : '14000'
            , ('lifeins_fee') : '0', ('lifeins') : '0', ('provisi') : '1.00', ('provisi_fee') : '1750000', ('provisi_type') : 'Prepaid'
            , ('firstpay') : '95887700', ('hargachasis') : '', ('hargakaroseri') : '', ('kolommutasidebit') : '', ('kolommutasisaldo') : ''
            , ('blacklist') : '', ('plafon') : '', ('ro') : 'Yes', ('tujuan') : 'Personal', ('kcu_branch') : '', ('norek_bca') : ''
            , ('hub_debitor') : '', ('penj_ktpno') : '', ('penj_nama') : '', ('penj_birthdate') : '', ('penj_birtplace') : ''
            , ('penj_jenkel') : '', ('penj_alamat') : '', ('penj_kel') : '', ('penj_kec') : '', ('penj_kab') : '', ('penj_prov') : ''
            , ('penj_agama') : '', ('penj_occ') : '', ('penj_spouse_ktp') : '', ('penj_spouse_name') : '', ('penj_spouse_birthdate') : ''
            , ('penj_spouse_birthplace') : '', ('penj_spouse_jenkel') : '', ('penj_spouse_alamat') : '', ('penj_spouse_kel') : ''
            , ('penj_spouse_kec') : '', ('penj_spouse_kab') : '', ('penj_spouse_prov') : '', ('penj_spouse_agama') : '', ('penj_spouse_occ') : ''
            , ('carins_corp') : 'NEW - SINAR MAS', ('carins_branch') : '(NSMS012) TIPE 3 - W2 - CS', ('ins_type') : 'TLO,ALL RISK,ALL RISK'
            , ('rscc') : 'No', ('rsmb') : 'Yes', ('tjh') : '', ('ins_deduc') : '', ('ins_payment') : '', ('lifeins_corp') : '(01299) PT. ASURANSI JIWA BCA'
            , ('lifeins_branch') : '(01299-20) FULL COVER (ENTRY>01-09-2018)', ('other_bukti') : '', ('other_luastanah') : ''
            , ('other_luasbangunan') : '', ('jenis_cluster') : '', ('salestype') : '', ('salesagent') : '', ('salesoffice') : ''
            , ('packet') : '(000) Non Packet', ('bpkbowner') : 'AHMAD', ('pendidikan') : '', ('npwp') : '', ('bukutab_cabang') : '']))

