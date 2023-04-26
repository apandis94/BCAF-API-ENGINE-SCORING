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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'data ME for scoring request'
reqdata = WS.sendRequest(findTestObject('Search_ME', [('MID') : MID, ('sourceapps') : sourceapps, ('ip') : ip, ('userid') : userid
            , ('branch') : branch, ('tipekons') : tipekons, ('marital') : marital, ('penjamin') : penjamin, ('tipepenjamin') : tipepenjamin
            , ('cluster') : cluster, ('custname') : custname, ('id_type') : id_type, ('id_no') : id_no, ('birthplace') : birthplace
            , ('birthdate') : birthdate, ('alamatktp') : alamatktp, ('kelurahan') : kelurahan, ('kecamatan') : kecamatan
            , ('kabupaten') : kabupaten, ('provinsi') : provinsi, ('kodepos') : kodepos, ('jenkel') : jenkel
            , ('supperson') : supperson, ('namaibu') : namaibu, ('agama') : agama, ('job') : job, ('ecocode') : ecocode
            , ('est_since') : est_since, ('jenisusaha') : jenisusaha, ('jabatan') : jabatan, ('income') : income, ('alamat') : alamat
            , ('fax') : fax, ('kodepos1') : kodepos1, ('kodetlp') : kodetlp, ('tlpno') : tlpno, ('ext') : ext, ('spouse_name') : spouse_name, ('spouse_idtype') : spouse_idtype
            , ('spouse_jenkel') : spouse_jenkel, ('spouse_idno') : spouse_idno, ('spouse_agama') : spouse_agama, ('spouse_birthdate') : spouse_birthdate, ('spouse_birthplace') : spouse_birthplace
            , ('spouse_alamat') : spouse_alamat, ('spouse_kel') : spouse_kel, ('spouse_kec') : spouse_kec, ('spouse_kab') : spouse_kab, ('spouse_prov') : spouse_prov
            , ('spouse_occ_ktp') : spouse_occ_ktp, ('spouse_nama_occ') : spouse_nama_occ, ('spouse_jabatan') : spouse_jabatan, ('spouse_occ_kartunama') : spouse_occ_kartunama, ('spouse_alamat_occ') : spouse_alamat_occ
            , ('spouse_fax') : spouse_fax, ('spouse_kec_occ') : spouse_kec_occ, ('spouse_kodepos_occ') : spouse_kodepos_occ, ('spouse_kodetlp_occ') : spouse_kodetlp_occ, ('spouse_notlp_occ') : spouse_notlp_occ
            , ('spouse_ext_occ') : spouse_ext_occ, ('dealername') : dealername, ('dealerbranch') : dealerbranch
            , ('dealer_addr') : 'Jln. Alternatif Cibubur Rt. 001 Rw 007, Kampung Nagewer', ('dealer_kota') : 'Bogor', ('dealer_hp') : '0218234370'
            , ('dealer_fax') : dealer_fax, ('dealer_auth') : dealer_auth, ('dealer_norek') : dealer_norek, ('car_cond') : car_cond
            , ('brand') : brand, ('model') : model, ('type') : type, ('year') : year, ('kind') : kind
            , ('purpose') : purpose, ('color') : color, ('engineno') : engineno, ('bodyno') : bodyno, ('bpkb_owner') : bpkb_owner
            , ('policeno') : policeno, ('bpkbno') : bpkbno, ('otr') : otr, ('dp') : dp, ('dp_percent') : dp_percent, ('principal') : principal
            , ('res_value') : res_value, ('tenor') : tenor, ('flatrate') : flatrate, ('effrate') : effrate, ('installment') : installment
            , ('loan_type') : loan_type, ('outstanding') : outstanding, ('biaya_pp') : biaya_pp, ('adm_fee') : adm_fee, ('carins_fee') : carins_fee
            , ('lifeins_fee') : lifeins_fee, ('lifeins') : lifeins, ('provisi') : provisi, ('provisi_fee') : provisi_fee, ('provisi_type') : provisi_type
            , ('firstpay') : firstpay, ('hargachasis') : hargachasis, ('hargakaroseri') : hargakaroseri, ('kolommutasidebit') : kolommutasidebit, ('kolommutasisaldo') : kolommutasisaldo
            , ('blacklist') : blacklist, ('plafon') : plafon, ('ro') : ro, ('tujuan') : tujuan, ('kcu_branch') : kcu_branch, ('norek_bca') : norek_bca
            , ('hub_debitor') : hub_debitor, ('penj_ktpno') : penj_ktpno, ('penj_nama') : penj_nama, ('penj_birthdate') : penj_birthdate, ('penj_birtplace') : penj_birtplace
            , ('penj_jenkel') : penj_jenkel, ('penj_alamat') : penj_alamat, ('penj_kel') : penj_kel, ('penj_kec') : penj_kec, ('penj_kab') : penj_kab, ('penj_prov') : penj_prov
            , ('penj_agama') : penj_agama, ('penj_occ') : penj_occ, ('penj_spouse_ktp') : penj_spouse_ktp, ('penj_spouse_name') : penj_spouse_name, ('penj_spouse_birthdate') : penj_spouse_birthdate
            , ('penj_spouse_birthplace') : penj_spouse_birthplace, ('penj_spouse_jenkel') : penj_spouse_jenkel, ('penj_spouse_alamat') : penj_spouse_alamat, ('penj_spouse_kel') : penj_spouse_kel
            , ('penj_spouse_kec') : penj_spouse_kec, ('penj_spouse_kab') : penj_spouse_kab, ('penj_spouse_prov') : penj_spouse_prov, ('penj_spouse_agama') : penj_spouse_agama, ('penj_spouse_occ') : penj_spouse_occ
            , ('carins_corp') : carins_corp, ('carins_branch') : carins_branch, ('ins_type') : ins_type
            , ('rscc') : rscc, ('rsmb') : rsmb, ('tjh') : tjh, ('ins_deduc') : ins_deduc, ('ins_payment') : ins_payment, ('lifeins_corp') : lifeins_corp
            , ('lifeins_branch') : lifeins_branch, ('other_bukti') : other_bukti, ('other_luastanah') : other_luastanah
            , ('other_luasbangunan') : other_luasbangunan, ('jenis_cluster') : jenis_cluster, ('salestype') : salestype, ('salesagent') : salesagent, ('salesoffice') : salesoffice
            , ('packet') : packet, ('bpkbowner') : bpkbowner, ('pendidikan') : pendidikan, ('npwp') : npwp, ('bukutab_cabang') : bukutab_cabang]))


'store json response to variable'
def slurper = new groovy.json.JsonSlurper()
def result = slurper.parseText(reqdata.getResponseBodyContent())

def reqid_kons = result.data.requestid1
def reqid_spouse = result.data.requestid2

println("requestid kons : "+ reqid_kons)

'store var to global variable' 
GlobalVariable.response_searchME_kons = reqid_kons
GlobalVariable.response_searchME_spouse = reqid_spouse

println ("kons req id is :"+ GlobalVariable.response_searchME_kons)
println ("spouse req id is : "+ GlobalVariable.response_searchME_spouse)

'verify response status code'
WS.verifyResponseStatusCode(reqdata, 200)

'show response to report in test suite'
response = reqdata.getResponseText()

KeywordUtil.logInfo("$response")
