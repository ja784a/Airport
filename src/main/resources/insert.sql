insert into airline (airline_name, logo, s_airline_jp, s_airline_eg) values 
('ANA', 'ana.jpg', 'えーえぬえー', 'A N A'), 
('JAL', 'jal.jpg', 'にほんこうくう', 'Japan Airlines'), 
('スカイマーク', 'sky.jpg', 'スカイマーク', 'Skymark'), 
('エアドゥ', 'ado.jpg', 'エアドゥ', 'Air Do'), 
('ソラシドエア', 'snj.jpg', 'ソラシドエア', 'Solaseed Air'), 
('FDA', 'fda.jpg', 'フジドリームエアラインズ', 'Fuji Dream Airlines'), 
('トキエア', 'tok.jpg', 'トキエア', 'Toki Air')

insert into timetable (airline_id, dept_time, new_dept_time, dest_id, gate, remark_id) values 
(1, '07:05:00', null, 1, 4, null )

insert into dest (dest_jp, dest_eg, s_dest_jp, s_dest_eg) values 
('東京', 'Tokyo', 'とうきょう', 'Tokyo'), 
('札幌', 'Sapporo', 'さっぽろ', 'Sapporo'), 
('那覇', 'Naha', 'なは', 'Naha'), 
('仙台', 'Sendai', 'せんだい', 'Sendai'), 
('松本', 'Matsumoto', 'まつもと', 'Matsumoto'), 
('茨城', 'Ibaraki', 'いばらき', 'Ibaraki'), 
('鹿児島', 'Kagoshima', 'かごしま', 'Kagoshima'), 
('長崎', 'Nagasaki', 'ながさき', 'Nagasaki'), 
('下地島', 'Shimojishima', 'しもじしま', 'Shimojisima'), 
('青森', 'Aomori', 'あおもり', 'Aomori'), 
('花巻', 'Hanamaki', 'はなまき', 'Hanamaki'), 
('新潟', 'Nigata', 'にいがた', 'Niigata')

insert into remark (remark_jp, remark_eg) values 
( null, null ), 
('搭乗口誘導中', 'Now Boarding'), 
('遅延', 'Delayed'), 
('欠航', 'Canceled'), 
('搭乗口変更', 'Gate Changed') 
